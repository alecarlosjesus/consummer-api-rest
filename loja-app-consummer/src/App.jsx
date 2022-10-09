import { BrowserRouter, Routes, Route} from 'react-router-dom'
import ListaProdutos from './components/ListaProdutos';
import FormProduto from './components/FormProduto';

export default function App(){

    return (
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<ListaProdutos/>} />
          <Route path='/incluir' element={<FormProduto/>}/>
          <Route path='/editar/:id' element={<FormProduto/>}/>
        </Routes>
      </BrowserRouter>
    );
}