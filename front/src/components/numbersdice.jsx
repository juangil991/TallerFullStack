import React, { useState } from 'react'
import { connect } from 'react-redux';
import { fetchRandom } from '../actions';
import Results from './results';

const From = (props) => {// component stateless
  const [state, setState] = useState();
  const [validate, setValidate] = useState(false);

  const onSubmit = (e) => {
    e.preventDefault();
    validate && props.dispatch(fetchRandom(state));
  };

  const handleInputChange = (e) => {
    e.preventDefault();
    e.target.value>0 && setValidate(true);
    e.target.value<1 && setValidate(false)
    setState(e.target.value);
  };

  return <div> 
    <form className='row g-3' onSubmit={onSubmit} >
        <div className='col-auto mt-4'>
            Numero de dados
        </div>
        <div className='col-auto'>
            <input type="number"
                className='mt-1'
                placeholder='Numeros Mayores a 0'
                onChange={handleInputChange}
            />
            <span className="text-danger text-small d-block mb-2">
              {!validate&&"Ingrese numero mayor a 0"}
             </span>
        </div>
        <div className='col-auto'>
            <button type="submit" disabled={props.loading} className='btn btn-success'>Tirar</button>
        </div>
    </form>
    {props.result?<Results/>:""}
  </div>
}


const stateMapToPros = state => {
  return {
    loading: state.view.loading,
    result: state.random.estado
  }
}


export default connect(stateMapToPros)(From)
