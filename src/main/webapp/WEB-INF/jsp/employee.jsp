<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>



<script>

    $.getJSON('/api/employee/', {
        ajax: 'true'
    }, function (data){
        console.log(data)
    $.each(data, function(index, single) {
        var fullName = single.firstName + "" + single.lastName;
        $('#employee-table').find('tbody')
                 .append("<tr>") +
                            "<td>" + single.id + "</td>"+
                            "<td>" + single.firstName +" " + single.lastName + "</td>"+
                            "<td>" + single.background + "</td>"+
                            "<td>" + "<select><option>(Select Project)</option></select>" + "</td>"+
                            "<td>" + "<button onclick='editEmployee(" + sinle.id + ")'>Edit</button>" +"</td>"+
                            "<td>" + "<button onclick='editEmployee(" + sinle.id + ")'>Delete</button>" +"</td>"+

                        "</tr>";

    });
 });
</script>

<div class="container">

    <h2> Employee List</h2>
    <table id="employee-table" class="table table-striped table-hover">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Background</th>
                <th>Projects</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <%--jquery will append our data here--%>
        </tbody>
    </table>


    </table>



</div>

<%@include file="includes/footer.jsp" %>