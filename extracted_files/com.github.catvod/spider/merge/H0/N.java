package com.github.catvod.spider.merge.h0;

import android.view.View;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ N(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0012.m2996(this)) {
            case 0:
                Q q = (Q) C0017.m3674(this);
                int iM5737 = C0032.m5737(this);
                if (iM5737 <= 0) {
                    C0047.m7777(q);
                    break;
                } else {
                    ArrayList arrayListM9022 = C0057.m9022(q);
                    O o = (O) C0028.m5167(arrayListM9022, iM5737);
                    int i = iM5737 - 1;
                    C0055.m8716(arrayListM9022, iM5737, (O) C0028.m5167(arrayListM9022, i));
                    C0055.m8716(arrayListM9022, i, o);
                    C0008.m1998(q);
                    break;
                }
            default:
                Q q2 = (Q) C0017.m3674(this);
                int iM57372 = C0032.m5737(this);
                if (iM57372 <= 0) {
                    C0047.m7777(q2);
                    break;
                } else {
                    ArrayList arrayListM90222 = C0057.m9022(q2);
                    T t = (T) C0028.m5167(arrayListM90222, iM57372);
                    int i2 = iM57372 - 1;
                    C0055.m8716(arrayListM90222, iM57372, (T) C0028.m5167(arrayListM90222, i2));
                    C0055.m8716(arrayListM90222, i2, t);
                    C0008.m1998(q2);
                    break;
                }
        }
    }
}