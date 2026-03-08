package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFlagAlt4: ImageVector
    get() {
        if (_SiFlagAlt4 != null) {
            return _SiFlagAlt4!!
        }
        _SiFlagAlt4 = ImageVector.Builder(
            name = "Regular.SiFlagAlt4",
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
                moveTo(3f, 3f)
                verticalLineToRelative(18f)
                moveTo(3f, 4.927f)
                lineToRelative(2.727f, -0.668f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.11f, 0.657f)
                lineToRelative(0.107f, 0.052f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.99f, 0.685f)
                lineToRelative(3.061f, -0.705f)
                lineTo(21f, 15.064f)
                lineToRelative(-3.065f, 0.705f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.991f, -0.684f)
                lineToRelative(-0.106f, -0.052f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.111f, -0.657f)
                lineTo(3f, 15.044f)
                close()
            }
        }.build()

        return _SiFlagAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt4: ImageVector? = null
