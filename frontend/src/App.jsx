import { useEffect, useState } from "react";
import { getProducts, createProduct, deleteProduct } from "./api";
import "./App.css";

function App() {
  const [data, setData] = useState([]);
  const [name, setName] = useState("");
  const [price, setPrice] = useState("");

  const load = async () => {
    const res = await getProducts();
    setData(res);
  };

  useEffect(() => {
    load();
  }, []);

  const add = async () => {
    await createProduct({ name, price });
    setName("");
    setPrice("");
    load();
  };
  const remove = async (id) => {
    await deleteProduct(id);
    load();
  };
  return (
    <div>
      <h1>Products</h1>

      <input
        value={name}
        onChange={(e) => setName(e.target.value)}
        placeholder="Name"
      />
      <input
        value={price}
        onChange={(e) => setPrice(e.target.value)}
        placeholder="Price"
      />
      <button onClick={add}>Add</button>

      {data.map((p) => (
        <div key={p.id}>
          {p.name} - {p.price}
          <button onClick={() => remove(p.id)}>Delete</button>
        </div>
      ))}
    </div>
  );
}

export default App;
