 $(document).ready( function () {
	 
	 console.log("books.js load")
	 
//	DATATABLE INIT
	 var table = $('#booksTable').DataTable({
			sAjaxSource: "/bibliospring/books/all",
			sAjaxDataProp: "",
			order: [[ 0, "asc" ]],
			aoColumns: [
			    { mData: "isbn"},
			    { mData: "title" },
				{ mData: "subtitle" },
				{ mData: "releaseDate" },
				{ mData: "authorList" },
				{ mData: null },
			],
			columnDefs:[ {
					targets: 4,
					render: function ( data, type, full ){					
						return $.map( data, function ( element, index ) {
        					return '<a href="#">'+ element.authorName +'</a>';
        				} ).join( ' ' );
                    }
				}, {
					targets: 5,
					render: function ( data, type, full ){					
						return "soon";
                    }
				},
			]
	 })
	 
	var substringMatcher = function(strs) {
		  return function findMatches(q, cb) {
		    var matches, substringRegex;		
		    // an array that will be populated with substring matches
		    matches = [];		
		    // regex used to determine if a string contains the substring `q`
		    substrRegex = new RegExp(q, 'i');		
		    // iterate through the pool of strings and for any string that
		    // contains the substring `q`, add it to the `matches` array
		    $.each(strs, function(i, str) {
		      if (substrRegex.test(str)) {
		        matches.push(str);
		      }
		    });
	    cb(matches);
	  };
	};
	
	 
	$('#categorieComplete').typeahead({
	  hint: true,
	  highlight: true,
	  minLength: 1
	}, {
	  name: 'categoryName',
	  source: substringMatcher(getJson('/bibliospring/categories/allForAutocomplete').responseJSON)
	});
	
	 
});
 function getJson(url){
	return $.ajax({
	    url : url,
	    type : 'GET',
	    dataType : 'json',
	    async : false,
	    success : function(returnedResult, statut){
	    	 return returnedResult;
	    }});
}
 
 function toObject(arr) {
	  var rv = {};
	  for (var i = 0; i < arr.length; ++i)
	    rv[i] = arr[i];
	  return rv;
	}