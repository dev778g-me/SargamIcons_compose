package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBookmark: ImageVector
    get() {
        if (_SiBookmark != null) {
            return _SiBookmark!!
        }
        _SiBookmark = ImageVector.Builder(
            name = "Filled.SiBookmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 17.025f)
                curveToRelative(-0.142f, 0f, -0.341f, 0.072f, -0.588f, 0.208f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.835f, 0.56f)
                curveToRelative(-0.614f, 0.464f, -1.317f, 1.085f, -1.983f, 1.706f)
                arcToRelative(62f, 62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.455f, 2.43f)
                lineToRelative(-0.04f, 0.041f)
                lineToRelative(-0.013f, 0.014f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.055f, 0.012f)
                arcTo(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21.95f)
                verticalLineTo(4.438f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.43f, 2f)
                horizontalLineToRelative(7.14f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4.438f)
                verticalLineTo(21.95f)
                arcToRelative(0.05f, 0.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.085f, 0.034f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.013f, -0.014f)
                lineToRelative(-0.04f, -0.041f)
                lineToRelative(-0.151f, -0.158f)
                arcToRelative(67f, 67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.304f, -2.272f)
                curveToRelative(-0.666f, -0.621f, -1.37f, -1.242f, -1.983f, -1.707f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.835f, -0.56f)
                curveToRelative(-0.247f, -0.135f, -0.446f, -0.207f, -0.588f, -0.207f)
            }
        }.build()

        return _SiBookmark!!
    }

@Suppress("ObjectPropertyName")
private var _SiBookmark: ImageVector? = null
