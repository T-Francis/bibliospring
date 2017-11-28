$(document).ready( function () {
	
	 var table = $('#copiesTable').DataTable({
			sAjaxSource: "/bibliospring/copies/all",
			sAjaxDataProp: "",
			order: [[ 0, "asc" ]],
			aoColumns: [
			    { mData: "idCopy"},
			    { mData: "book.isbn" },
				{ mData: "book.title" },
				{ mData: null },
			],
			columnDefs:[ {
					targets: 3,
					render: function ( data, type, full ){					
						return "soon";
                    }
				},
			]
	 })
	 
});