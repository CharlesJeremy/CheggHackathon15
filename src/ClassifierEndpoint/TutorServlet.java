import Tutor.Tutor;

import com.google.gson.Gson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import java.io.IOException;
import java.util.List;


/**
 * Servlet implementation class GetTutorsServlet
 */
@WebServlet("/GetTutorsServlet")
public class TutorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<Tutor> availableTutors;

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

         //= new GetTutors();
        List<Tutor> tutorObjectList = tutors.getAllTutors();
        //String jsonString = convertToJSON(tutorObjectList);
        HttpSession thisSession = request.getSession();
        thisSession.setAttribute("studentName", name);
        thisSession.setAttribute("tutorsArray", availableTutors);
        RequestDispatcher dispatch = request.getRequestDispatcher("updateFrontEnd.jsp?tutors=");
        dispatch.forward(request, response);

    }

    protected String convertToJSON(List<Tutor> tutorObjectList)
    {
        Gson gson = new Gson();

        //Convert the list of Tutor Objects to JSON
        return gson.toJson(tutorObjectList);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  ServletContext context = request.getServletContext();


        }

    }
