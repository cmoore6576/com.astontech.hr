
<%@include file="../../includes/header.jsp" %>
<%--<%@include file="../../includes/navbar.jsp" %>--%>
<%--<%@include file="../../includes/subnav_admin.jsp" %>--%>

<%--<div class="btn-group">--%>
    <%--&lt;%&ndash;<a href="#" class="btn btn-default">8</a>&ndash;%&gt;--%>
    <%--<div class="btn-group">--%>
        <%--<a href="#" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">--%>
          <%--Make--%>
            <%--<span class="caret"></span>--%>
        <%--</a>--%>
        <%--<ul class="dropdown-menu">--%>
            <%--<li><a href="#">Dropdown link</a></li>--%>
            <%--<li><a href="#">Dropdown link</a></li>--%>
            <%--<li><a href="#">Dropdown link</a></li>--%>
        <%--</ul>--%>
    <%--</div>--%>
<%--</div>--%>

<%--<div class="btn-group">--%>
    <%--&lt;%&ndash;<a href="#" class="btn btn-default">8</a>&ndash;%&gt;--%>
    <%--<div class="btn-group">--%>
        <%--<a href="#" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">--%>
            <%--Model--%>
            <%--<span class="caret"></span>--%>
        <%--</a>--%>
        <!-- The second value will be selected initially -->
        <select name="select" style="color:black;"> <!--Supplement an id here instead of using 'name'-->
            <c:forEach var="make" items="${makeList}">
                <option value="${make.id}">${make.makeName}</option>
            </c:forEach>
        </select>
    </div>
</div>

<%--<script>--%>

    <%--$(document).ready(function()--%>
    <%--{--%>
        <%--$("#successAlert").delay(8000).fadeOut(2000);--%>
        <%--$("#warningAlert").delay(10000).fadeOut(2000);--%>

    <%--});--%>
<%--</script>--%>

<%--<div class="wrapper">--%>

    <%--<%--sidebar here--%>

    <%--<%@include file="vehicle_sidebar.jsp" %>--%>

    <%--<div id="main-wrapper" class="col-sm-10">--%>
        <%--<div class="col-sm-8" >--%>

            <%--<form:form cssClass="form-horizontal" modelAttribute="vehicleVo" action="/admin/vehicle/add" method="post">--%>
                <%--<fieldset>--%>
                    <%--<legend> Vehicle Management</legend>--%>

                    <%--<div class="form-group">--%>
                        <%--<label for="inputNewModel" class="col-lg-2 control-label">Model</label>--%>
                        <%--<div class="col-lg-10">--%>
                            <%--<form:input path="newModel" type="text" class="form" id="inputNewModel" placeholder="Model"></form:input>--%>
                            <%--<span class="help-block"> Enter each new Model on a new line.</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>




                    <%--<div class="form-group">--%>
                        <%--<label for="inputNewMake" class="col-lg-2 control-label">Make</label>--%>
                        <%--<div class="col-lg-10">--%>
                            <%--<form:textarea path="newMake" type="text" class="form-control" rows="3" id="inputNewMake"></form:textarea>--%>
                            <%--<span class="help-block"> Enter each new Make on a new line.</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>


                    <%--<div class="form-group">--%>
                        <%--<label for="inputNewMake" class="col-lg-2 control-label">Vehicle</label>--%>
                        <%--<div class="col-lg-10">--%>
                            <%--<form:textarea path="newvehicle" type="text" class="form-control" rows="3" id="inputNewvehicle"></form:textarea>--%>
                            <%--<span class="help-block"> Enter each new Vehicle on a new line.</span>--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="form-group">--%>
                        <%--<div class="col-lg-10 col-lg-offset-2">--%>
                            <%--<form:button type="reset" value="cancel" class="btn btn-default">Cancel</form:button>--%>
                            <%--<form:button type="submit" value="save" class="btn btn-primary">Save</form:button>--%>

                        <%--</div>--%>
                    <%--</div>--%>

                <%--</fieldset>--%>
            <%--</form:form>--%>
        <%--</div>--%>

        <%--<div class="col-sm-4">--%>

            <%--<%--<ALERTS>--%>

            <%--<%--SUCCESS ALERTS--%
            <%--<div class="${successAlert == null ? 'hidden': successAlert}" id="successAlert">--%>
                <%--<div class="alert alert-dismissible alert-success">--%>
                    <%--<button type="button" class="close" data-dismiss="alert">&times;</button>--%>
                    <%--<strong>Vehicle added successfully to the database!</strong> You successfully read <a href="#" class="alert-link">this important alert message</a>.--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<%--WARNING ALERT --%>
            <%--<div class="${warningAlert == null ? 'hidden': warningAlert}" id="warningAlert">--%>
                <%--<div class="alert alert-dismissible alert-warning">--%>
                    <%--<button type="button" class="close" data-dismiss="alert">&times;</button>--%>
                    <%--<h4>Be Advised</h4>--%>
                    <%--<p> All fields are required. <a href="#" class="alert-link"></a>.</p>--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<%--ERROR ALERT--%>
            <%--<div class="${errorAlert == null ? 'hidden': errorAlert}" id="errorAlert">--%>
                <%--<div class="alert alert-dismissible alert-danger">--%>
                    <%--<button type="button" class="close" data-dismiss="alert">&times;</button>--%>
                    <%--<strong>Oh snap!</strong> <a href="#" class="alert-link">Change a few things up</a> and try submitting again.--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>


<%--${}--%>



<%--<%@include file="../../includes/footer.jsp" %>--%>