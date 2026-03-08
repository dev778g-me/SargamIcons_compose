package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiOctagonCheck: ImageVector
    get() {
        if (_SiOctagonCheck != null) {
            return _SiOctagonCheck!!
        }
        _SiOctagonCheck = ImageVector.Builder(
            name = "Filled.SiOctagonCheck",
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
                moveToRelative(8.904f, 6.351f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.628f, -1.162f)
                lineToRelative(-4.314f, 6.04f)
                lineToRelative(-2.165f, -2.166f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.414f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.52f, -0.126f)
                close()
            }
        }.build()

        return _SiOctagonCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SiOctagonCheck: ImageVector? = null
