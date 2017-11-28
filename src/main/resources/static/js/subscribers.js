$(document).ready( function () {
	 var table = $('#subscribersTable').DataTable({
			sAjaxSource: "/bibliospring/subscribers/all",
			sAjaxDataProp: "",
			order: [[ 0, "asc" ]],
			aoColumns: [
			    { "mData": "lastName" },
				{ "mData": "firstName" },
				{ "mData": "rentLimit" }
			]
	 })
});