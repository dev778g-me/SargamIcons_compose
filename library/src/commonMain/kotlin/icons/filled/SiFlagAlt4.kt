package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlagAlt4: ImageVector
    get() {
        if (_SiFlagAlt4 != null) {
            return _SiFlagAlt4!!
        }
        _SiFlagAlt4 = ImageVector.Builder(
            name = "Filled.SiFlagAlt4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 21f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(0.651f)
                lineToRelative(1.49f, -0.364f)
                lineToRelative(0.428f, -0.095f)
                curveToRelative(2.15f, -0.427f, 4.388f, -0.14f, 6.36f, 0.826f)
                lineToRelative(0.106f, 0.051f)
                arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.325f, 0.61f)
                lineToRelative(3.061f, -0.705f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.225f, 0.973f)
                lineTo(22f, 15.063f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.775f, 0.975f)
                lineToRelative(-3.066f, 0.706f)
                curveToRelative(-2.24f, 0.516f, -4.594f, 0.247f, -6.654f, -0.76f)
                lineToRelative(-0.107f, -0.052f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.434f, -0.585f)
                lineTo(4f, 15.828f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _SiFlagAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt4: ImageVector? = null
