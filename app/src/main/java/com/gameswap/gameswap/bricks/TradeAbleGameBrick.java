package com.gameswap.gameswap.bricks;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gameswap.gameswap.R;
import com.gameswap.gameswap.TradeableItemDetail;
import com.wayfair.brickkit.BrickViewHolder;
import com.wayfair.brickkit.brick.BaseBrick;
import com.wayfair.brickkit.padding.BrickPadding;
import com.wayfair.brickkit.size.BrickSize;

/**
 * Created by rvelusamy on 2/10/17.
 */

public class TradeAbleGameBrick extends BaseBrick {

    private TradeableItemDetail itemDetail;

    public TradeAbleGameBrick(Context context, BrickSize spanSize, BrickPadding padding, TradeableItemDetail object) {
        super(context, spanSize, padding);

        this.itemDetail = object;
    }

    @Override
    public void onBindData(BrickViewHolder brickViewHolder) {
        ((TradeAbleGameBrickViewHolder) brickViewHolder).saleProductImage.setImageURI(itemDetail.imageUri);
        ((TradeAbleGameBrickViewHolder) brickViewHolder).saleProductName.setText(itemDetail.tradeAbleItemName);
        ((TradeAbleGameBrickViewHolder) brickViewHolder).saleProductPrice.setText(itemDetail.tradeAbleItemPrice);
    }

    @Override
    public int getLayout() {
        return R.layout.trade_able_brick;
    }

    @Override
    public BrickViewHolder createViewHolder(View view) {
        return new TradeAbleGameBrickViewHolder(view);
    }


    private static class TradeAbleGameBrickViewHolder extends BrickViewHolder {

        private ImageView saleProductImage;
        private TextView saleProductName;
        private TextView saleProductPrice;

        public TradeAbleGameBrickViewHolder(View itemView) {
            super(itemView);
            saleProductImage = (ImageView) itemView.findViewById(R.id.sale_product_image);
            saleProductName = (TextView) itemView.findViewById(R.id.sale_product_name);
            saleProductPrice = (TextView) itemView.findViewById(R.id.sale_product_price);
        }
    }
}
