import React,{Component} from 'react';
import Numbersdice from '../components/numbersdice';
import Results from '../components/results';


class App extends Component {// component stateful
    render() {
      return (
        <div>
          <h1>Dados Random</h1>
          <p>Generar Dados Aleatoriamente</p>
          <Numbersdice/>
          <Results/>
        </div>
      )
    }
  }
  
  export default App