<%@ page import="mainpack.Items.Item"%>
<%@ page import="mainpack.BDD"%>

<html>

<head>

<meta charset=UTF-8>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<title>Matching</title>
</head>

<%
	BDD bdd = new BDD();
	Item item = bdd.getRandomItem();
%>

<body>
	<div class="container">
	<div class='page-header'>
				<h1>Matching <small>Adopt 1 Com'</small></h1></div>
		<form action='/matching.jsp' method='post'>
			<div class="row">
				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<img src="http://static.openruby.com/assets/pages/d9/41/d9412a06dcc425bcc72a91c523749725_330.jpg" alt="image">
						<div class="caption">
							<h3>
								<%out.println(item.getTitle());%>
							</h3>
							<p>
								<%out.println(item.renderHTML());%>
							</p>
							<p>
								<button type='submit' class='btn btn-success btn-lg'>
									<span class="glyphicon glyphicon-heart"></span>
								</button>
								<button type='submit' class='btn btn-danger btn-lg'>
									<span class="glyphicon glyphicon-remove"></span>
								</button>
							</p>
						</div>
					</div>
				</div>
		</form>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#cp").change(function() {
				getVilles($('#cp').val())
			});
		});
		function getVilles(cp) {
			$.getJSON("v2/cpdb/" + cp, function(data) {
				var html = "";
				for ( var index = 0; index < data.length; ++index) {
					html = html + "<option value='"+data[index].ville+"'>" + data[index].ville + "</option>";
				}
				$("#ville").html(html);
			})
		}
	</script>
</body>