const API = "http://localhost:8080/api/products";

export const getProducts = async () => {
  const res = await fetch(API);
  return res.json();
};

export const createProduct = async (data) => {
  await fetch(API, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  });
};

export const deleteProduct = async (id) => {
  await fetch(`${API}/${id}`, {
    method: "DELETE",
  });
};
