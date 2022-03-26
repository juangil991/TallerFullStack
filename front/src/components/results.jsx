import React, { useState } from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
    const dices= props.result;
    const show= dices.map((element)=>
        <img src={'https://www.random.org/dice/dice'+ element +'.png'} />
    )
  return(<div>
          {show} 
      </div>  )
}

const stateMapToPros = state => {
    return {
      result: state.random.result?.randomDice
    }
  
}


export default connect(stateMapToPros)(Result)