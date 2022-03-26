export const fetchRandom = (state) => (dispatch) => {

    dispatch({ type: "view-loading" });

    const request={
        dices:state
    }

    return fetch(`http://localhost:8080`, {
        method: 'POST', // *GET, POST, PUT, DELETE, etc.
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(request) // body data type must match "Content-Type" header
    }).then(response => response.json())
      .then(json => {
          dispatch({ type: "random-result", data: json });
          dispatch({ type: "view-loaded" });
        })
}


//TODO: agregar las demas acciones