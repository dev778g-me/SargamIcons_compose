package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDangerous: ImageVector
    get() {
        if (_SiDangerous != null) {
            return _SiDangerous!!
        }
        _SiDangerous = ImageVector.Builder(
            name = "Filled.SiDangerous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.91f, 3.23f)
                lineTo(3.23f, 7.913f)
                verticalLineToRelative(-0.01f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.23f, 0.57f)
                verticalLineToRelative(7.054f)
                curveToRelative(0f, 0.22f, 0.08f, 0.42f, 0.23f, 0.57f)
                lineTo(7.9f, 20.77f)
                curveToRelative(0.15f, 0.15f, 0.36f, 0.23f, 0.57f, 0.23f)
                horizontalLineToRelative(7.06f)
                curveToRelative(0.22f, 0f, 0.42f, -0.08f, 0.57f, -0.23f)
                lineToRelative(4.67f, -4.673f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.23f, -0.57f)
                verticalLineTo(8.473f)
                curveToRelative(0f, -0.22f, -0.08f, -0.42f, -0.23f, -0.57f)
                lineTo(16.1f, 3.23f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, -0.23f)
                horizontalLineTo(8.48f)
                curveToRelative(-0.22f, 0f, -0.42f, 0.08f, -0.57f, 0.23f)
                moveToRelative(1.797f, 5.063f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.414f)
                lineTo(10.586f, 12f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, 1.414f)
                lineTo(12f, 13.414f)
                lineToRelative(2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -1.414f)
                lineTo(13.414f, 12f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, -1.414f)
                lineTo(12f, 10.586f)
                close()
            }
        }.build()

        return _SiDangerous!!
    }

@Suppress("ObjectPropertyName")
private var _SiDangerous: ImageVector? = null
