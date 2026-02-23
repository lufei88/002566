package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends com.github.catvod.spider.merge.E0.p {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.github.catvod.spider.merge.E0.p pVar, int i, int i2) {
        super(i, pVar);
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        switch (C0021.m4327(this)) {
            case 0:
                if (cVar instanceof com.github.catvod.spider.merge.Y0.c) {
                    C0047.m7777(cVar);
                    List listM7111 = C0042.m7111(this, g.class);
                    if (C0064.m9636(listM7111) > 1) {
                        Boolean boolM1120 = C0000.m1120((com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0)));
                        for (int i = 1; i < C0064.m9636(listM7111); i++) {
                            boolM1120 = C0028.m5186(C0010.m2318(boolM1120) & C0010.m2318(C0000.m1120((com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, i)))));
                        }
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (cVar instanceof com.github.catvod.spider.merge.Y0.c) {
                    break;
                } else {
                    break;
                }
        }
        return C0016.m3595(cVar, this);
    }
}