<%@page import="com.spoc.entity.Vertical"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.spoc.entity.Trainer" %>
    <%@page import="com.spoc.entity.Training_Request" %>
    <%@page import="com.spoc.entity.Technology" %>
     <%@page import="com.spoc.entity.Vertical" %>
     <%@page import="com.spoc.entity.Room" %>
    
     <%@page import="java.util.List" %>
     <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="static/style1.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,600,700&display=swap" rel="stylesheet">
    <title>Module 2</title>
</head>
<body>

    <div class="row-container">
		<h1>Pending Requests</h1>
		<%-- <c:set var="i" value="1" />
		 <c:forEach var="request" items="${requests}"> --%>
		 <%
		 List<Training_Request> users = new ArrayList<Training_Request>();
		 users=(List<Training_Request>)request.getAttribute("requests");
		
		 int i=0;
		 for(i=0; i<users.size();i++)
		 {
		 %>
		<div class="row border-round">
			<div class="row-content">
				<table class="table">
                    <tbody>
                    <tr>
                        <td>Id:<%=users.get(i).getRequestId() %></td>
                        </tr>
                        <tr>
                         <td>Domain:<%=users.get(i).getTechnologyName() %></td>
                        </tr>
                        <tr>
                         <td>Technology:<%=users.get(i).getVerticalName() %></td>
                        </tr>
                        <tr>
                        <td>Status:<%if(users.get(i).getRequestStatus()==0)
                        			{
                        				%>
                        				Available.
                        				<% 
                        			}
                        else
                        {%>
                        	Not Available
                       <%  }
                        			%>
                        </td>
                        </tr>
                        <tr><td><input type=button value="Assign Trainer"></td></tr>
                    </tbody>
                </table>
			</div>
		</div>
		<%} %>
		<h1>Available Trainers</h1>
		<%
		 List<Trainer> trainer = new ArrayList<Trainer>();
		 trainer=(List<Trainer>)request.getAttribute("trainer");
		 List<Technology> techno=new ArrayList<Technology>();
		 techno=(List<Technology>)request.getAttribute("techno");
		 List<Vertical> vertical=new ArrayList<Vertical>();
		 vertical=(List<Vertical>)request.getAttribute("vertical");
		 
		 int j=0;
		 int k=0;			 
		 	for(j=0; j<trainer.size();j++)
		 	{
			 if((trainer.get(j).getTechnologyId()==techno.get(k).getTechnologyId()))
			 {
				 
		 %>
		<div class="row border-round">
			<div class="row-content">
				<table class="table">
                    <tbody>
                        <tr><td>Id:<%=trainer.get(j).getTrainerId() %></td>
                        </tr>
                        <tr><td>Trainer Name:<%=trainer.get(j).getTrainerName() %></td>
                        </tr>
                        <tr><td>Technology Name:<%=techno.get(k).getTechnologyName() %></td>
                        </tr>
                        <tr><td>Vertical Name:<%=vertical.get(j).getVerticalName() %> </td>
                        </tr>
                    </tbody>
                </table>
			</div>
		</div>
		<%}k++;}%>  
   
		<h1>Rooms Availability</h1>
		<% 
		List<Room> room = new ArrayList<Room>();
		room=(List<Room>)request.getAttribute("room");
		System.out.println(room);
		int h;
		for(h=0;h<room.size();h++){
			
				
		%>
		<div class="row border-round">
			<div class="row-content">
				<table class="table">
                    <tbody>
                        <tr>
                            <td>Room Number:<%=room.get(h).getRoomNo() %></td>
                        </tr>
                        <tr>
                            <td>Status:<%if(room.get(h).isRoomStatus())
                            {
                				%>
                				Available.
                				<% 
                			}
                else
                {%>
                	Not Available
               <%  }
                			%>
                        </tr>
                      
                    </tbody>
                </table>
			</div>
		</div>
		<%} %>
 

    
		<h1>Verticals</h1>
		<%
		int m;
		for(m=0;m<vertical.size();m++){
			
		%>		
		<div class="row border-round">
			<div class="row-content">
				<table class="table">
                    <tbody>
                        <tr>
                            <td>Id:<%=vertical.get(m).getVerticalId()%></td>
                        </tr>
                        <tr>
                            <td>Technology Name:<%=techno.get(m).getTechnologyName()%></td>
                        </tr>
                    </tbody>
                </table>
			</div>
		</div>
		<%} %>
		
</body>
</html>