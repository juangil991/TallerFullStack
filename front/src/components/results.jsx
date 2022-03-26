import React, { useState } from 'react'
import { connect } from 'react-redux';
import Imagenes from './imagenes';
const Result = (props) => {
   let url=[];
   const show= url.map((element)=>{
       <div>
       <img src='https://www.random.org/dice/dice4.png'/>
       </div>
   })

  return(<div>
          {props.result && 'Resultado: '+ props.result.map((element)=>
             "ResultDice: "+ element + "\n"
          )}
      </div>  )
}

const stateMapToPros = state => {

  return {
    result: state.random.result?.randomDice,
    loading: state.view.loading
  }
}


export default connect(stateMapToPros)(Result)