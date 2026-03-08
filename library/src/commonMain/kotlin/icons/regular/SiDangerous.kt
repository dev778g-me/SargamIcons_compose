package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiDangerous: ImageVector
    get() {
        if (_SiDangerous != null) {
            return _SiDangerous!!
        }
        _SiDangerous = ImageVector.Builder(
            name = "Regular.SiDangerous",
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
                moveToRelative(15f, 15f)
                lineToRelative(-3f, -3f)
                moveToRelative(0f, 0f)
                lineTo(9f, 9f)
                moveToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                moveToRelative(-3f, 3f)
                lineToRelative(-3f, 3f)
                moveTo(3.23f, 7.913f)
                lineTo(7.91f, 3.23f)
                curveToRelative(0.15f, -0.15f, 0.35f, -0.23f, 0.57f, -0.23f)
                horizontalLineToRelative(7.05f)
                curveToRelative(0.21f, 0f, 0.42f, 0.08f, 0.57f, 0.23f)
                lineToRelative(4.67f, 4.673f)
                curveToRelative(0.15f, 0.15f, 0.23f, 0.35f, 0.23f, 0.57f)
                verticalLineToRelative(7.054f)
                curveToRelative(0f, 0.21f, -0.08f, 0.42f, -0.23f, 0.57f)
                lineTo(16.1f, 20.77f)
                curveToRelative(-0.15f, 0.15f, -0.35f, 0.23f, -0.57f, 0.23f)
                horizontalLineTo(8.47f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.57f, -0.23f)
                lineToRelative(-4.67f, -4.673f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.23f, -0.57f)
                verticalLineTo(8.473f)
                curveToRelative(0f, -0.21f, 0.08f, -0.42f, 0.23f, -0.57f)
                close()
            }
        }.build()

        return _SiDangerous!!
    }

@Suppress("ObjectPropertyName")
private var _SiDangerous: ImageVector? = null
