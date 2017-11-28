$(document).ready(function() {

	var table = $('#borrowsTable').DataTable({
		sAjaxSource : "/bibliospring/borrows/all",
		sAjaxDataProp : "",
		order : [ [ 0, "asc" ] ],
		aoColumns : [ 
			{ mData : "borrowDate" },
			{ mData : "returnDate" },
			{ mData : "biblioUser.lastName" },
			{ mData : "copy.book.title"},
			{ mData : "subscriber.firstName"},
		],
		columnDefs : [ {
				targets : 1,
				render : function(data, type, full) {
					console.log(full.idBorrow);
					console.log(full.returnDate);
					if (data == null){
						return "a rendre !!";
					}else{
						return data;					
					}
				}
			},
		]
	})

});