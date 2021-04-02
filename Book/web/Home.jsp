<%-- 
    Document   : Home
    Created on : Mar 15, 2021, 12:11:47 AM
    Author     : dinhg
--%>

<%@page import="context.ProductDao"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="entity.Category" %>
<%@page import="entity.Product" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/templatemo_style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="templatemo_container">
            <jsp:include page="menu.jsp"></jsp:include>
                <div id="templatemo_content">
                    <div id="templatemo_content_left">
                        <div class="templatemo_content_left_section">
                            <h1>Categories</h1>
                            <ul>
                            <c:forEach items="${listC}" var="c">
                                <li><a href="category?cid=${c.cid}">${c.cname}</a></li>
                                <!--<li>${c.cname}</li>-->
                            </c:forEach>                                                                                                             
                        </ul>
                    </div>

                    <div class="templatemo_content_left_section">
                        <h1>Bestsellers</h1>
                        <ul>
                            <li><a href="#">Đảo hải tặc</a></li>
                            <li><a href="#">Photography</a></li>
                            <li><a href="#">Cooking</a></li>
                            <li><a href="#">Đấu pha thương khung</a></li>
                            <li><a href="#">Sherlock home</a></li>
                            <li><a href="#">Nghìn lẻ một đêm</a></li>
                            <li><a href="#">Cấu trúc cơ sở dữ liệu và giải thuật</a></li>
                            <li><a href="#">Phàm nhân tu tiên</a></li>
                            <li><a href="#">Web Design</a></li>
                            <li><a href="http://www.photovaco.com" target="_parent">Free Photos</a></li>
                        </ul>
                    </div>
                </div>
                <div id="templatemo_content_right">
                    <c:forEach items="${listP}" var="p">
                        <div class="templatemo_product_box">                       
                            <div><h1>${p.name}</h1></div>
                            <img src="${p.image}" height="150" width="100" alt="image" />
                            <div class="product_info">
                                <p>${p.author}</p>
                                <h3>${p.price}$</h3>
                                <div class="buy_now_button"><a href="#">Add to card</a></div>
                                <div class="detail_button"><a href="subpage?pid=${p.id}">Detail</a></div>
                            </div>                                                  
                            <div class="cleaner">&nbsp;</div>    
                        </div>
                    </c:forEach>
                    <div class="cleaner_with_height">&nbsp;</div>
                    <div class="paging">
                    <c:forEach begin="1" end="${end}" var="i">
                        <a href="#">${i}</a>
                    </c:forEach>
                    </div>
                </div> <!-- end of content right -->           
            </div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
