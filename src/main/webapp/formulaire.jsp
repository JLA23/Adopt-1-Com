<%@ page import="java.util.Map"%>

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

<title>Formulaire</title>
</head>

<%
	Map<String, String[]> params = request.getParameterMap();

	if (params.containsKey("prenom")) {
		params.get("prenom");
	}
	if (params.containsKey("nom")) {
		params.get("nom");
	}
	if (params.containsKey("date")) {
		params.get("date");
	}
	if (params.containsKey("entreprise")) {
		params.get("entreprise");
	}
	if (params.containsKey("adresse")) {
		params.get("adresse");
	}
	if (params.containsKey("codep")) {
		params.get("codep");
	}
	if (params.containsKey("ville")) {
		params.get("ville");
	}
	if (params.containsKey("mail")) {
		params.get("mail");
	}
	if (params.containsKey("mail2")) {
		params.get("mail2");
	}
	if (params.containsKey("tel")) {
		params.get("tel");
	}
	if (params.containsKey("fax")) {
		params.get("prenom");
	}
	if (params.containsKey("prestation")) {
		params.get("prestation");
	}
	if (params.containsKey("domaine")) {
		params.get("domaine");
	}
	if (params.containsKey("description")) {
		params.get("description");
	}
	if (params.containsKey("facebook")) {
		params.get("facebook");
	}
	if (params.containsKey("twitter")) {
		params.get("twitter");
	}
	if (params.containsKey("linkedin")) {
		params.get("linkedin");
	}
	if (params.containsKey("google")) {
		params.get("google");
	}
	if (params.containsKey("password")) {
		params.get("password");
	}
	if (params.containsKey("password2")) {
		params.get("password2");
	}
%>

<body>
	<div class="container">

		<div class='col-sm-offset-1'>
			<h1>Formulaire Inscription</h1>
		</div>
		<form method='post' action='Formulaire' enctype='multipart/form-data'>

			<div class='row'>
				<div class='col-md-3 col-sm-offset-1'>
					<div class='form-group'>
						<label for='nom'>Nom (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("nom") != null ? params.get("nom") + "" : "");%>"
							name='nom' required>
					</div>
				</div>

				<div class='col-md-3'>
					<div class='form-group'>
						<label for='prenom'>Prénom (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("prenom") != null ? params.get("prenom")
					+ "" : "");%>"
							name='prenom' required>
					</div>
				</div>

				<div class='col-md-2'>
					<div class='form-group'>
						<label for='date'>Date de Naissance (*) : </label> <input
							type='date' class='form-control'
							value="<%out.println(params.get("date") != null ? params.get("date") + ""
					: "");%>"
							name='date' required>
					</div>
				</div>
			</div>

			<div class='row'>

				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='nom'>Photo (*) : </label><input type='hidden'
							name='MAX_FILE_SIZE' value='1048576' /><input type='file'
							value='' name='photo' required class='form-control'>
					</div>
				</div>

				<div class='col-md-4'>
					<br>Les photos doivent respecter le format X par Y, et peser 1
					Mo maximum.
				</div>
			</div>

			<div class='row'>
				<div class='col-md-8 col-sm-offset-1'>
					<div class='form-group'>
						<label for='entreprise'>Entreprise (*) : </label> <input
							type='text' class='form-control'
							value="<%out.println(params.get("entreprise") != null ? params
					.get("entreprise") + "" : "");%>"
							name='entreprise' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-8 col-sm-offset-1'>
					<div class='form-group'>
						<label for='adresse'>Adresse (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("adresse") != null ? params.get("adresse")
					+ "" : "");%>"
							name='adresse' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='codep'>Code Postal (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("codep") != null ? params.get("codep") + ""
					: "");%>"
							name='codep' required>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group'>
						<label for='ville'>Ville (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("ville") != null ? params.get("ville") + ""
					: "");%>"
							name='ville' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='mail'>E-Mail (*) : </label> <input type='email'
							class='form-control' placeholder='thierry.dupont@gmail.com'
							value="<%out.println(params.get("mail") != null ? params.get("mail") + ""
					: "");%>"
							name='mail' required>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group <%request.getAttribute("emailconf");%>'>
						<label for='mail2'>Confirmer E-Mail (*) : </label> <input
							type='email' class='form-control'
							placeholder='thierry.dupont@gmail.com'
							value="<%out.println(params.get("mail2") != null ? params.get("mail2") + ""
					: "");%>"
							name='mail2' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='tel'>Téléphone (*) : </label> <input type='text'
							class='form-control' placeholder='0670000000'
							value="<%out.println(params.get("tel") != null ? params.get("tel") + "" : "");%>"
							name='tel' required>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group'>
						<label for='fax'>Fax (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("fax") != null ? params.get("fax") + "" : "");%>"
							name='fax' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-8 col-sm-offset-1'>
					<div class='form-group'>
						<label for='profession'>Métier (*) : </label> <input type='text'
							class='form-control'
							value="<%out.println(params.get("profession") != null ? params
					.get("profession") + "" : "");%>"
							name='profession' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='prestation'>Type de Prestation (*) : </label> <select
							name='prestation' id='prestation' class='form-control'>
							<option value='produit'>Produit</option>
							<option value='service'>Service</option>
							<option value='both'>Les deux</option>
						</select>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group'>
						<label for='domaine'>Domaine d'Activité (*) : </label> <select
							name='domaine' id='domaine' required class='form-control'>
							<option value='agriculture'>Agriculture</option>
							<option value='plomberie'>Plomberie</option>
							<option value='librairie'>Librairie</option>
						</select>
					</div>
				</div>
			</div>

			<div class='row'>

				<div class='col-md-8 col-sm-offset-1'>
					<div class='form-group'>
						<label for='description'>Description : </label>
						<textarea name='description' id='description' rows=5
							class='form-control'>
							<%
								out.println(params.get("description") != null ? params
										.get("description") : "Comment voyez vous votre métier ?");
							%>
						</textarea>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='facebook'>Facebook (*) : </label> <input type='text'
							class='form-control' placeholder='http://monfacebook.fr/'
							value="<%out.println(params.get("facebook") != null ? params.get("facebook")
					+ "" : "");%>"
							name='facebook' required>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group'>
						<label for='twitter'>Twitter (*) : </label> <input type='text'
							class='form-control' placeholder='http://montwitter.fr/'
							value="<%out.println(params.get("twitter") != null ? params.get("twitter")
					+ "" : "");%>"
							name='twitter' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='linkedin'>LinkedIn (*) : </label> <input type='text'
							class='form-control' placeholder='http://monlinkedin.fr/'
							value="<%out.println(params.get("linkedin") != null ? params.get("linkedin")
					+ "" : "");%>"
							name='linkedin' required>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group'>
						<label for='google'>Google+ (*) : </label> <input type='text'
							class='form-control' placeholder='http://mongoogleplus.fr/'
							value="<%out.println(params.get("google") != null ? params.get("google")
					+ "" : "");%>"
							name='google' required>
					</div>
				</div>
			</div>

			<div class='row'>
				<div class='col-md-4 col-sm-offset-1'>
					<div class='form-group'>
						<label for='password'>Mot de passe (*) : </label> <input
							type='password' class='form-control'
							value="<%out.println(params.get("password") != null ? params.get("password")
					+ "" : "");%>"
							name='password' required>
					</div>
				</div>

				<div class='col-md-4'>
					<div class='form-group <%request.getAttribute("passwdconf");%>'>
						<label for='password2'>Confirmer Mot de passe (*) : </label> <input
							type='password' class='form-control'
							value="<%out.println(params.get("password2") != null ? params
					.get("password2") + "" : "");%>"
							name='password2' required>
					</div>
				</div>
			</div>

			<div class='form-group col-sm-offset-1'>
				<label>(*) : Champs requis</label>
			</div>

			<div class='form-group col-sm-offset-8'>
				<button type='submit' class='btn btn-success btn-lg'>Valider</button>

			</div>
		</form>
	</div>
</body>