package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.V0.o;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public abstract class i {
    public static void a(o oVar, r rVar) {
        C0065.m9779(rVar);
        r rVarM3117 = rVar;
        int i = 0;
        while (rVarM3117 != null) {
            r rVarM7395 = C0044.m7395(rVarM3117);
            int iM5344 = rVarM7395 != null ? C0030.m5344(rVarM7395) : 0;
            r rVarM31172 = C0013.m3117(rVarM3117);
            C0016.m3524(oVar, rVarM3117, i);
            if (rVarM7395 != null && C0044.m7395(rVarM3117) == null) {
                if (iM5344 == C0030.m5344(rVarM7395)) {
                    rVarM3117 = (r) C0048.m7915(C0059.m9225(rVarM7395), C0035.m6143(rVarM3117));
                } else if (rVarM31172 == null) {
                    i--;
                    rVarM3117 = rVarM7395;
                } else {
                    rVarM3117 = rVarM31172;
                }
            }
            if (C0030.m5344(rVarM3117) > 0) {
                rVarM3117 = (r) C0048.m7915(C0059.m9225(rVarM3117), 0);
                i++;
            } else {
                while (C0013.m3117(rVarM3117) == null && i > 0) {
                    C0040.m6622(oVar, rVarM3117, i);
                    rVarM3117 = C0044.m7395(rVarM3117);
                    i--;
                }
                C0040.m6622(oVar, rVarM3117, i);
                if (rVarM3117 == rVar) {
                    return;
                } else {
                    rVarM3117 = C0013.m3117(rVarM3117);
                }
            }
        }
    }
}