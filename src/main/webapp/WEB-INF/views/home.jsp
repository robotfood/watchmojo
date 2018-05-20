<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<tiles:insertDefinition name="wmTemplate">
		<tiles:putAttribute name="body">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
						<h2>Welcome</h2>
					</div>
				</div>
			</div>
		</tiles:putAttribute>
	</tiles:insertDefinition>
</body>