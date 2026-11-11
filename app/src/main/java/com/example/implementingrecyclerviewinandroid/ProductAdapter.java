package com.example.implementingrecyclerviewinandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position)
    {
        Product product = productList.get(position);
        holder.title.setText(product.getTitle());
        holder.price.setText(product.getPrice());

        holder.image.setImageResource(product.getImageResId());
        holder.itemView.setOnClickListener(v -> {
            android.content.Intent intent = new android.content.Intent(v.getContext(), ProductDetailActivity.class);
            intent.putExtra("PRODUCT_TITLE", product.getTitle());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        TextView price;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.productImage);
            title = itemView.findViewById(R.id.productTitle);
            price = itemView.findViewById(R.id.productPrice);
        }
    }
}