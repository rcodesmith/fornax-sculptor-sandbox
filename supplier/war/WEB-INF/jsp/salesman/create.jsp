<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Salesman</h2>
    <form:form action="/rest/salesman" method="POST" modelAttribute="entity">
        <div id="salesman_name">
            <label for="_name">Name:</label>
            <form:input cssStyle="width:300px" id="_name" path="name"/>
            <br/>
            <form:errors cssClass="errors" id="_name" path="name"/>
        </div>
        <br/>
        <div id="salesman_emailAddress">
            <label for="_emailAddress">Email:</label>
            <form:input cssStyle="width:300px" id="_emailAddress" path="emailAddress"/>
            <br/>
            <form:errors cssClass="errors" id="_emailAddress" path="emailAddress"/>
        </div>
        <br/>
        <div class="submit" id="salesman_submit">
            <input id="proceed" type="submit" value="Save"/>
        </div>
    </form:form>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
