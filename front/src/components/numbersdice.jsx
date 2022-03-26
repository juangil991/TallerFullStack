import React, { useState } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';
import Results from './results';

const From = (props) => {// component stateless
  const [state, setState] = useState();
  const onSubmit = (e) => {
    e.preventDefault();
    props.dispatch(fetchRandom(state));

  };

  return <div>
    <form onSubmit={onSubmit}>
      <label htmlFor="list">Ingrese el numero de Dados</label>
      <br />
      <input id="number" type="number"
        onChange={(e) =>setState(e.target.value)}
      ></input>
      <br />
      <button type="submit" disabled={props.loading}>
        Tirar
      </button>
    </form>
    {isNaN(props.result)?"":<Results/>}
  </div>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading,
    result: state.random.result?.randomDice
  }
}


export default connect(stateMapToPros)(From)
