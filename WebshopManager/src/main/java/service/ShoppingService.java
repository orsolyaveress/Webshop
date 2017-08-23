package service;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Chestnut;
import model.Cucumber;
import model.Product;
import model.RubberDuck;
import model.Salami;

/**
 * Servlet implementation class ShoppingService
 */

@WebServlet(urlPatterns = { "/Shopping" })
public class ShoppingService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShoppingService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HashMap<Product, Integer> productList = new HashMap<Product, Integer>();

		int cucumberQuantity = tryParse(request.getParameter("cucumber"));
		int salamiQuantity = tryParse(request.getParameter("salami"));
		int rubberDuckQuantity = tryParse(request.getParameter("rubberduck"));
		int chestnutQuantity = tryParse(request.getParameter("chestnut"));

		productList.put(new Cucumber(), cucumberQuantity);
		productList.put(new Salami(), salamiQuantity);
		productList.put(new RubberDuck(), rubberDuckQuantity);
		productList.put(new Chestnut(), chestnutQuantity);


		DiscountCalculator discountCalculator = new DefaultDiscountCalculator();
		AppliedDiscount appliedDiscount;

		appliedDiscount = discountCalculator.calculate(productList);

		response.getWriter().println(appliedDiscount.toString());

	}

	private int tryParse(String s) {
		int res = 0;
		try {
			if (s.equals(null))
				throw new ParserException("The value is empty!");
			if (!s.matches("[0-9]+"))
				throw new ParserException("The value is not a number!");	
			res = Integer.parseInt(s);
		} catch (ParserException e) {
			e.getMessage();	
		}
		return res;
	}

}
