<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<tiles:insertDefinition name="soundboardTemplate">
		<tiles:putAttribute name="body">
			<div class="container">
				<div class="row">
					<div class="col-xs-12">
					<p>A simple HTML 5 based sound board because you shouldn't have
					to download 15 apps to prank call people.</p>
					</div>
				</div>
			</div>
		</tiles:putAttribute>
	</tiles:insertDefinition>
</body>