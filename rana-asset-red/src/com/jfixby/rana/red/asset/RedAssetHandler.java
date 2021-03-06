
package com.jfixby.rana.red.asset;

import com.jfixby.rana.api.Asset;
import com.jfixby.rana.api.SealedAssetsContainer;
import com.jfixby.rana.api.asset.AssetHandler;
import com.jfixby.scarabei.api.assets.ID;

public class RedAssetHandler implements AssetHandler {

	private final ID id;
	private SealedAssetsContainer assetsContainer;

	@Override
	public String toString () {
		return "#[" + this.assetsContainer + "]";
	}

	public RedAssetHandler (final ID asset_id) {
		this.id = asset_id;
	}

	public void setAssetContainer (final SealedAssetsContainer container) {
		this.assetsContainer = container;
	}

	@Override
	public ID ID () {
		return this.id;
	}

	@Override
	public Asset asset () {
		return this.assetsContainer.getAsset(this.id);
	}

	@Override
	public void printAll () {
		this.assetsContainer.printAll();
	}

// @Override
// public long readPackageTimeStamp () {
// return this.assetsContainer.readPackageTimeStamp();
// }

	public SealedAssetsContainer getContainer () {
		return this.assetsContainer;
	}

}
