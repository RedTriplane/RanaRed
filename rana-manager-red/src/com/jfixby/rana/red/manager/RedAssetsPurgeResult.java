
package com.jfixby.rana.red.manager;

import com.jfixby.rana.api.manager.AssetsPurgeResult;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Set;
import com.jfixby.scarabei.api.log.L;

public class RedAssetsPurgeResult implements AssetsPurgeResult {
	final Set<AssetsContainerOwner> owners = Collections.newSet();

	@Override
	public void print () {
		L.d("AssetsPurgeResult");
		this.owners.print("           purged");
	}

	public void addOwner (final AssetsContainerOwner owner) {
		this.owners.add(owner);
	}

}
