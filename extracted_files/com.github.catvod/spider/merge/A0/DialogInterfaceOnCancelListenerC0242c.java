package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0242c implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0242c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (C0011.m2772(this)) {
            case 0:
                C0045.m7576((C0246g) C0003.m1434(this));
                break;
            case 1:
                C0024.m4709((C0254o) C0003.m1434(this));
                break;
            case 2:
                C0065.m9798((C0259u) C0003.m1434(this));
                break;
            case 3:
                C0013.m3140((C0233B) C0003.m1434(this));
                break;
            case 4:
                C0045.m7576((C0246g) C0003.m1434(this));
                break;
            case 5:
                C0024.m4709((C0254o) C0003.m1434(this));
                break;
            case 6:
                C0001.m1192((M) C0003.m1434(this));
                break;
            case 7:
                W w = (W) C0003.m1434(this);
                C0047.m7777(w);
                C0016.m3575(new T(w, 1));
                break;
            case 8:
                C0047.m7777((S) C0003.m1434(this));
                break;
            default:
                S s = (S) C0003.m1434(this);
                C0047.m7777(s);
                C0016.m3575(new com.github.catvod.spider.merge.h0.y(s, 1));
                break;
        }
    }
}