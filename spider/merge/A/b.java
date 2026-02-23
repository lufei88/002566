package com.github.catvod.spider.merge.a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    public b() {
        C0049.m7993(this, this, C0012.m2978());
    }

    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceM4987 = C0027.m4987(iBinder, C0012.m2978());
        return (iInterfaceM4987 == null || !(iInterfaceM4987 instanceof c)) ? new C0231a(iBinder) : (c) iInterfaceM4987;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strM2978 = C0012.m2978();
        if (i >= TRANSACTION_notify && i <= 16777215) {
            C0022.m4473(parcel, strM2978);
        }
        if (i == 1598968902) {
            C0026.m4972(parcel2, strM2978);
            return true;
        }
        if (i == TRANSACTION_notify) {
            C0033.m5832(this, C0044.m7430(parcel), C0032.m5760(parcel), C0044.m7430(parcel), (Notification) (C0032.m5760(parcel) != 0 ? C0065.m9800(C0055.m8781(), parcel) : null));
        } else if (i == TRANSACTION_cancel) {
            C0002.m1295(this, C0044.m7430(parcel), C0032.m5760(parcel), C0044.m7430(parcel));
        } else {
            if (i != TRANSACTION_cancelAll) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            C0055.m8807(this, C0044.m7430(parcel));
        }
        return true;
    }
}