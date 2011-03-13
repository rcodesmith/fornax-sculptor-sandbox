<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Supplier</h2>
    <form:form action="/rest/supplier" method="POST" modelAttribute="supplier">
        <div id="supplier_name">
            <label for="_name">Name:</label>
            <form:input cssStyle="width:300px" id="_name" path="name"/>
            <br/>
            <form:errors cssClass="errors" id="_name" path="name"/>
        </div>
        <br/>
        <div id="supplier_url">
            <label for="_url">URL:</label>
            <form:input cssStyle="width:300px" id="_url" path="url"/>
            <br/>
            <form:errors cssClass="errors" id="_url" path="url"/>
        </div>
        <br/>
        <div class="submit" id="supplier_submit">
            <input id="proceed" type="submit" value="Save"/>
        </div>
    </form:form>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
