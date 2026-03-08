package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBin: ImageVector
    get() {
        if (_SiBin != null) {
            return _SiBin!!
        }
        _SiBin = ImageVector.Builder(
            name = "Filled.SiBin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(11.6f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 3.4f)
                lineTo(7.4f, 23f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.395f, -3.226f)
                lineTo(4f, 19.6f)
                lineTo(4f, 8f)
                lineToRelative(0.005f, -0.103f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                close()
                moveTo(8f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(14f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15.024f, 1.012f)
                arcTo(2.204f, 2.204f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 3.2f)
                lineTo(17f, 4f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(3f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-0.8f)
                curveTo(7f, 1.988f, 7.988f, 1f, 9.2f, 1f)
                horizontalLineToRelative(5.6f)
                close()
                moveTo(9.2f, 3f)
                curveToRelative(-0.108f, 0f, -0.2f, 0.092f, -0.2f, 0.2f)
                lineTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-0.8f)
                arcToRelative(0.205f, 0.205f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -0.196f)
                lineTo(14.8f, 3f)
                close()
            }
        }.build()

        return _SiBin!!
    }

@Suppress("ObjectPropertyName")
private var _SiBin: ImageVector? = null
