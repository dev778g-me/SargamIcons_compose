package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiInflight: ImageVector
    get() {
        if (_SiInflight != null) {
            return _SiInflight!!
        }
        _SiInflight = ImageVector.Builder(
            name = "Regular.SiInflight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.925f, 10.74f)
                lineTo(15.5f, 11f)
                lineToRelative(-5.482f, -4.578f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.825f, 6f)
                lineToRelative(-1.29f, 0.006f)
                lineTo(11f, 11f)
                horizontalLineTo(5.5f)
                lineTo(4.377f, 9.898f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, -0.638f)
                lineTo(2f, 9.25f)
                lineToRelative(1.985f, 3.699f)
                lineTo(10f, 15f)
                horizontalLineTo(22f)
                lineToRelative(-0.032f, -2.165f)
                curveToRelative(0.002f, -1.124f, -0.907f, -2.082f, -2.043f, -2.095f)
                moveToRelative(0f, 0f)
                quadToRelative(0.052f, 0.03f, 0f, 0f)
                moveTo(6f, 19f)
                horizontalLineToRelative(12f)
            }
        }.build()

        return _SiInflight!!
    }

@Suppress("ObjectPropertyName")
private var _SiInflight: ImageVector? = null
