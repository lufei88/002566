package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* renamed from: com.github.catvod.spider.merge.a0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0250k implements DialogInterface.OnDismissListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f724short = {-31369, 17646, -25643, 24119, 22613, 21793, 17429, 2637, 2651, 17566, -30961, 18070, -26195, 23631, 23085, 18029, 22361, 20809, 30620, 18150, -31730, 17815, -25940, 24398, 22828, 17772, 21592, 2864, 2858, 17895, -31490, 17767, -26020, 24510, 23004, 17820, 21672, 3009, 2976, 2979, 2978, 17687, -31186, 18359, -26484, 23918, 23308, 18252, 22136, 22503, 32665, 18375};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0250k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* renamed from: ۦۧۧ۟, reason: contains not printable characters */
    public static short[] m7002() {
        if (C0058.m9131() < 0) {
            return f724short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (C0030.m5420(this)) {
            case 0:
                ((C0254o) C0003.m1378(this)).n = true;
                C0038.m6402(C0055.m8814(m7002(), 42, 10, 2369));
                break;
            case 1:
                ((C0259u) C0003.m1378(this)).g = true;
                C0038.m6402(C0052.m8337(m7002(), 30, 12, 2961));
                break;
            case 2:
                ((C0233B) C0003.m1378(this)).p = true;
                C0038.m6402(C0044.m7509(m7002(), 20, 10, 2913));
                break;
            case 3:
                ((C0254o) C0003.m1378(this)).n = true;
                C0038.m6402(C0048.m7902(m7002(), 10, 10, 2144));
                break;
            default:
                ((M) C0003.m1378(this)).b = true;
                C0038.m6402(C0010.m2300(m7002(), 0, 10, 2584));
                break;
        }
    }
}