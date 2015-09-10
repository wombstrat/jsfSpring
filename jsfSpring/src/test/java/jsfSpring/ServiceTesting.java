package jsfSpring;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.payload;
import static org.holiday.endpoint.HolidayEndPoint.NAMESPACE_URI;

import javax.xml.transform.Source;

import org.home.bs.UserBs;
import org.home.entity.UsuarioModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/applicationContext.xml" })
public class ServiceTesting {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private UserBs userBs;

	private MockWebServiceClient mockWebServiceClient;

	@Before
	public void createClient() {
		System.out.println("Se crea mock");
		mockWebServiceClient = MockWebServiceClient
				.createClient(applicationContext);
	}

	@Test
	public void XD() {
		System.out.println(userBs.getAplicaciones());
		Assert.assertNotNull(userBs.getAplicaciones());

	}

	@Test
	public void holidayRequest() {
		System.out.println("holidayRequest()");
		StringBuilder requestPayLoadXml = new StringBuilder(
				"<HolidayRequest xmlns='" + NAMESPACE_URI + "'>");
		requestPayLoadXml.append("<Holiday>");
		requestPayLoadXml.append("<StartDate>2006-07-03</StartDate>");
		requestPayLoadXml.append("<EndDate>2006-07-03</EndDate>");
		requestPayLoadXml.append("</Holiday>");
		requestPayLoadXml.append("<Employee>");
		requestPayLoadXml.append("<Number>234234</Number>");
		requestPayLoadXml.append("<FirstName>Ramiro</FirstName>");
		requestPayLoadXml.append("<LastName>Jiménez</LastName>");
		requestPayLoadXml.append("</Employee>");
		requestPayLoadXml.append("</HolidayRequest>");

		String XD = "<holiday xmlns=\"\"><endDate>2006-07-03</endDate><nameEmployee>XDDDDD</nameEmployee><startDate>2006-07-03</startDate></holiday>";

		Source requestPayLoad = new StringSource(requestPayLoadXml.toString());
		Source responsePayLoad = new StringSource(XD);

		mockWebServiceClient.sendRequest(withPayload(requestPayLoad))
				.andExpect(payload(responsePayLoad));
		System.out.println("--------------------3");

	}

	@Test
	public void guardar() {
		UsuarioModel usuarioModel = new UsuarioModel();
		usuarioModel.setNombre("Prueba1");
		usuarioModel.setDescripcion("Descripción");
		usuarioModel.setNombreEmpresa("pruebaNombreEmpresa");
		userBs.save(usuarioModel);
	}

	public UserBs getUserBs() {
		return userBs;
	}

	public void setUserBs(UserBs userBs) {
		this.userBs = userBs;
	}
}
