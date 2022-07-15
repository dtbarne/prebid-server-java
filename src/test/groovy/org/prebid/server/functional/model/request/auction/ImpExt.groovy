package org.prebid.server.functional.model.request.auction

import groovy.transform.ToString
import org.prebid.server.functional.model.bidder.Generic
import org.prebid.server.functional.model.bidder.Rubicon

@ToString(includeNames = true, ignoreNulls = true)
class ImpExt {

    ImpExtPrebid prebid
    Generic generic
    @Deprecated
    Rubicon rubicon
    @Deprecated
    ImpExtContext context
    ImpExtContextData data
    String tid

    static ImpExt getDefaultImpExt() {
        new ImpExt().tap {
            prebid = ImpExtPrebid.defaultImpExtPrebid
        }
    }
}
