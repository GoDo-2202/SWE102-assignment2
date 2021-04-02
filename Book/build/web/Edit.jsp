
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="addEmployeeModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="edit" method="post">
                <div class="modal-header">						
                    <h4 class="modal-title">Add Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">	
                    <div class="form-group">
                        <label>ID</label>
                        <input value="${subpage.id}" name="id" type="text" class="form-control" readonly="" required>
                    </div>
                    <div class="form-group">
                        <label>Name</label>
                        <input value="${subpage.name}" name="name" type="text" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Author</label>
                        <input value="${subpage.author}" name="author" type="text" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Image</label>
                        <input value="${subpage.image}" name="image" type="text" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input value="${subpage.price}" name="price" type="text" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Category</label>
                        <textarea name="category" type="text" class="form-control" required>${subpage.category}</textarea>
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <textarea name="description" class="form-control" required>${subpage.description}</textarea>
                    </div>
                    <div class="form-group">
                        <label>Category</label>
                        <select name="category" class="form-select" aria-label="Default select example">
                            <c:forEach items="${listC}" var="o">
                                <option value="${o.cid}">${o.cname}</option>
                            </c:forEach>
                        </select>
                    </div>

                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success" value="Edit">
                </div>
            </form>
        </div>
    </div>
</div>
