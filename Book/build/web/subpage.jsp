<%-- 
    Document   : subpage
    Created on : Mar 15, 2021, 12:34:11 AM
    Author     : dinhg
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
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
                </div> <!-- end of content left -->

                <div id="templatemo_content_right">

                    <h1>${subpage.name}</h1>
                    <div class="image_panel"><img src="${subpage.image}" /></div><br> 
                    <form method="post" action="cart">
                    <ul>
                        <li>Category:<p>${subpage.category}</p></li>
                        <li>Tác giả: <a href="#">${subpage.author}</a></li>
                        <li>Detail:<p>${subpage.description}</p></li>  
                        <li><h3><p>Price: ${subpage.price}$</p><h3></li> 
                    </ul>
                    Quantity:<input type="number" name="quantity" value="1"><br/>
                    <div class="buy_now_button"><input type="submit" name="action" value="Add to cart"></div>
                    </form>
                    <div class="cleaner_with_height">&nbsp;</div>
                </div> <!-- end of content right -->   
            </div> <!-- end of content -->
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
