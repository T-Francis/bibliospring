$(document).ready( function () {
	 var table = $('#authorsTable').DataTable({
			sAjaxSource: "/bibliospring/authors/all",
			sAjaxDataProp: "",
			order: [[ 0, "asc" ]],
			aoColumns: [
			    { "mData": "lastName" },
				{ "mData": "firstName" },
				{ "mData": "authorName" }
			]
	 })
});