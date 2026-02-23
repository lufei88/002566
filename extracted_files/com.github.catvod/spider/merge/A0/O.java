package com.github.catvod.spider.merge.a0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h0.RunnableC0322b;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ Object e;

    public /* synthetic */ O(Object obj, EditText editText, EditText editText2, EditText editText3, int i) {
        this.a = i;
        this.e = obj;
        this.b = editText;
        this.c = editText2;
        this.d = editText3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0050.m8093(this)) {
            case 0:
                S s = (S) C0017.m3653(this);
                C0047.m7777(s);
                String strM6312 = C0037.m6312(C0065.m9797(C0023.m4612(this)));
                String strM63122 = C0037.m6312(C0065.m9797(C0018.m3968(this)));
                String strM63123 = C0037.m6312(C0065.m9797(C0033.m5893(this)));
                try {
                    AlertDialog alertDialogM3145 = C0013.m3145(s);
                    if (alertDialogM3145 != null) {
                        C0004.m1577(alertDialogM3145);
                    }
                } catch (Exception unused) {
                }
                C0025.m4829(new P(s, strM6312, strM63122, strM63123, 0));
                break;
            case 1:
                S s2 = (S) C0017.m3653(this);
                C0047.m7777(s2);
                String strM63124 = C0037.m6312(C0065.m9797(C0023.m4612(this)));
                String strM63125 = C0037.m6312(C0065.m9797(C0018.m3968(this)));
                String strM63126 = C0037.m6312(C0065.m9797(C0033.m5893(this)));
                C0045.m7652(s2);
                C0025.m4829(new RunnableC0322b(strM63124, strM63125, strM63126, 0));
                break;
            default:
                S s3 = (S) C0017.m3653(this);
                C0047.m7777(s3);
                String strM63127 = C0037.m6312(C0065.m9797(C0023.m4612(this)));
                String strM63128 = C0037.m6312(C0065.m9797(C0018.m3968(this)));
                String strM63129 = C0037.m6312(C0065.m9797(C0033.m5893(this)));
                C0045.m7652(s3);
                C0025.m4829(new RunnableC0322b(strM63127, strM63128, strM63129, 1));
                break;
        }
    }
}