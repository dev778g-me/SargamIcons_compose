package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMoreSquareVert: ImageVector
    get() {
        if (_SiMoreSquareVert != null) {
            return _SiMoreSquareVert!!
        }
        _SiMoreSquareVert = ImageVector.Builder(
            name = "Regular.SiMoreSquareVert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.467f, 11f)
                horizontalLineToRelative(-0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.533f, 0.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.294f, 0.239f, 0.533f, 0.533f, 0.533f)
                horizontalLineToRelative(0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.533f, -0.533f)
                verticalLineToRelative(-0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.533f, -0.533f)
                close()
                moveTo(12.467f, 18f)
                horizontalLineToRelative(-0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.533f, 0.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.294f, 0.239f, 0.533f, 0.533f, 0.533f)
                horizontalLineToRelative(0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.533f, -0.533f)
                verticalLineToRelative(-0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.533f, -0.533f)
                close()
                moveTo(12.467f, 4f)
                horizontalLineToRelative(-0.934f)
                arcToRelative(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.533f, 0.533f)
                verticalLineToRelative(0.934f)
                curveToRelative(0f, 0.294f, 0.239f, 0.533f, 0.533f, 0.533f)
                horizontalLineToRelative(0.934f)
                arcTo(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.467f)
                verticalLineToRelative(-0.934f)
                arcTo(0.533f, 0.533f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.467f, 4f)
                close()
            }
        }.build()

        return _SiMoreSquareVert!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreSquareVert: ImageVector? = null
