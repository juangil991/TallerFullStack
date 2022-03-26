import React,{Component} from 'react';
import Numbersdice from '../components/numbersdice';
import Results from '../components/results';


class App extends Component {// component stateful
    render() {
      return (
        <div>
          <h1>Dados Random</h1>
          <h4>Generar Dados Aleatoriamente</h4>
          <Numbersdice/>
        </div>
      )
    }
  }
  
  export default App