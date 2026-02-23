package com.github.catvod.spider.merge.a0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* renamed from: com.github.catvod.spider.merge.a0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0257s implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f729short = {2688, 2748, 2736, 2730, 2737, 2731, -26174, 30689, 20926, -31318, -2173, -31880, -30948, 23018, 25580, 28897, 32267, 30256, 29316, 28159, 23555, 24536, 20904, 21632, -2173, -26510, 18050, -30606, 29429, 32719};
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ Object d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0257s(EditText editText, EditText editText2, String str) {
        this.a = 3;
        this.b = editText;
        this.c = editText2;
        this.d = str;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0257s(Object obj, EditText editText, EditText editText2, int i) {
        this.a = i;
        this.d = obj;
        this.b = editText;
        this.c = editText2;
    }

    /* renamed from: ۤۤۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7076() {
        if (C0022.m4497() >= 0) {
            return f729short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
        switch (C0000.m1117(this)) {
            case 0:
                C0259u c0259u = (C0259u) C0009.m2124(this);
                C0047.m7777(c0259u);
                String strM6312 = C0037.m6312(C0065.m9797(C0052.m8323(this)));
                String strM63122 = C0037.m6312(C0065.m9797(C0031.m5662(this)));
                C0001.m1197(c0259u);
                c0259u.g = false;
                C0025.m4829(new com.github.catvod.spider.merge.W.i(c0259u, strM6312, strM63122, 6));
                return;
            case 1:
                C0254o c0254o = (C0254o) C0009.m2124(this);
                C0047.m7777(c0254o);
                String strM63123 = C0037.m6312(C0065.m9797(C0052.m8323(this)));
                String strM63124 = C0037.m6312(C0065.m9797(C0031.m5662(this)));
                C0056.m8936(c0254o);
                C0025.m4829(new com.github.catvod.spider.merge.W.i(c0254o, strM63123, strM63124, 8));
                return;
            case 2:
                W w = (W) C0009.m2124(this);
                C0047.m7777(w);
                String strM63125 = C0037.m6312(C0065.m9797(C0052.m8323(this)));
                String strM63126 = C0037.m6312(C0065.m9797(C0031.m5662(this)));
                C0031.m5590(w);
                C0025.m4829(new U(w, strM63125, strM63126, 0));
                return;
            default:
                EditText editTextM8323 = C0052.m8323(this);
                EditText editTextM5662 = C0031.m5662(this);
                String str = (String) C0009.m2124(this);
                try {
                    if (C0057.m8953(C0037.m6312(C0065.m9797(editTextM8323))) || C0057.m8953(C0037.m6312(C0065.m9797(editTextM5662)))) {
                        throw new Exception();
                    }
                    C0007.m1876(C0011.m2808(C0038.m6456(C0037.m6312(C0065.m9797(editTextM8323)))), str);
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, str);
                    C0018.m3933(sb, C0058.m9106(m7076(), 0, 6, 2783));
                    C0007.m1876(C0011.m2808(C0038.m6456(C0037.m6312(C0065.m9797(editTextM5662)))), C0047.m7763(sb));
                    return;
                } catch (Exception unused) {
                    C0038.m6402(C0057.m8978(m7076(), 6, 24, 2191));
                    return;
                }
        }
    }
}