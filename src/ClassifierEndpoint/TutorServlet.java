package ClassifierEndpoint;

import NaiveBayesClassifier.TutorFinder;
import Tutor.Tutor;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


/**
 * Servlet implementation class GetTutorsServlet
 */
@WebServlet("/TutorServlet")
public class TutorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TutorFinder tutorFinder;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TutorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        getAllTutors(request, response);
    }


    protected void getAllTutors(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name = request.getParameter("studentName");
        List<Tutor>availableTutors = tutorFinder.getSortedTutorSuggestions();
        //String jsonString = convertToJSON(tutorObjectList);
        ServletContext thisSession = request.getServletContext();
        thisSession.setAttribute("studentName", name);
        thisSession.setAttribute("tutorsArray", availableTutors);
        RequestDispatcher dispatch = request.getRequestDispatcher("updateFrontEnd.jsp?tutors=");
        dispatch.forward(request, response);

    }

   
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  ServletContext context = request.getServletContext();


        }

    }
