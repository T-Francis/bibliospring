$(document).ready(function() {

	var table = $('#categoriesTable').DataTable({
		sAjaxSource : "/bibliospring/categories/all",
		sAjaxDataProp : "",
		order : [ [ 0, "asc" ] ],
		aoColumns : [ 
			{ mData : "idCategory"},
			{ mData : "name" },
			{ mData : "description"	},
			{mData : null},
		],
		columnDefs : [ {
				targets : 0,
				visible: false,
				bSearchable: false
			}, {
				targets : 3,
				render : function(data, type, full) {
					return "soon";
				}
			},
		]
	})

});